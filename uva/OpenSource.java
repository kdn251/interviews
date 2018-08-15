// At an open-source fair held at a major university,
// leaders of open-source projects put sign-up
// sheets on the wall, with the project name at the
// top in capital letters for identification.
// Students then signed up for projects using
// their userids. A userid is a string of lower-case
// letters and numbers starting with a letter.
// The organizer then took all the sheets off the
// wall and typed in the information.
// Your job is to summarize the number of
// students who have signed up for each project.
// Some students were overly enthusiastic and put
// their name down several times for the same
// project. That’s okay, but they should only count
// once. Students were asked to commit to a single
// project, so any student who has signed up for more 
// than one project should not count for any project.
// There are at most 10,000 students at the university, 
// and at most 100 projects were advertised.

// Input
//     The input contains several test cases, each one ending with a line that starts with the digit 1. The last
//     test case is followed by a line starting with the digit 0.
//     Each test case consists of one or more project sheets. A project sheet consists of a line containing
//     the project name in capital letters, followed by the userids of students, one per line.

// Output
//     For each test case, output a summary of each project sheet. The summary is one line with the name
//     of the project followed by the number of students who signed up. These lines should be printed in
//     decreasing order of number of signups. If two or more projects have the same number of signups, they
//     should be listed in alphabetical order.

// Sample Input
// UBQTS TXT
// tthumb
// LIVESPACE BLOGJAM
// philton
// aeinstein
// YOUBOOK
// j97lee
// sswxyzy
// j97lee
// aeinstein
// SKINUX
// 1
// 0
// Sample Output
// YOUBOOK 2
// LIVESPACE BLOGJAM 1
// UBQTS TXT 1
// SKINUX 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import static java.lang.Character.isUpperCase;

/**
 * Created by kdn251 on 3/7/17.
 */

public class OpenSource {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while(!(line = br.readLine()).equals("0")) {
            HashMap<String, Integer> projects = new HashMap<String, Integer>();
            HashMap<String, String> students = new HashMap<String, String>();
            String project = line;
            projects.put(project, 0);

            while(!(line = br.readLine()).equals("1")) {
                if(isUpperCase(line.charAt(0))) {
                    project = line;
                    projects.put(project, 0);
                }

                else {
                    if(students.containsKey(line)) {
                        if(students.get(line).equals("")) {
                            continue;
                        }

                        else {
                            if(!students.get(line).equals(project)) {
                                projects.put(students.get(line), projects.get(students.get(line)) - 1);
                                students.put(line, "");
                            }
                        }
                    }

                    else {
                        projects.put(project, projects.get(project) + 1);
                        students.put(line, project);
                    }
                }
            }

            List<Pair> pairs = new ArrayList<Pair>();
            int count = 0;

            for(String s : projects.keySet()) {

                pairs.add(new Pair(s, projects.get(s)));

            }

            Collections.sort(pairs,new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    if(-Integer.compare(o1.total, o2.total) == 0) {
                        return o1.name.compareTo(o2.name);
                    }
                    return -Integer.compare(o1.total, o2.total);
                }
            });

            for(Pair p : pairs) {

                System.out.println(p.name + " " + p.total);

            }

        }

    }

}

class Pair {
    String name;
    int total;

    Pair(String name, int total) {
        this.name = name;
        this.total = total;
    }
}