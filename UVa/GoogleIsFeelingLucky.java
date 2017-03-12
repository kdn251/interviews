// Google is one of the most famous Internet search engines which hosts and develops a number of Internetbased
// services and products. On its search engine website, an interesting button ‘I’m feeling lucky’
// attracts our eyes. This feature could allow the user skip the search result page and goes directly to the
// first ranked page. Amazing! It saves a lot of time.
// The question is, when one types some keywords and presses ‘I’m feeling lucky’ button, which web
// page will appear? Google does a lot and comes up with excellent approaches to deal with it. In this
// simplified problem, let us just consider that Google assigns every web page an integer-valued relevance.
// The most related page will be chosen. If there is a tie, all the pages with the highest relevance are
// possible to be chosen.
// Your task is simple, given 10 web pages and their relevance. Just pick out all the possible candidates
// which will be served to the user when ‘I’m feeling lucky’.

// Input
// 	The input contains multiple test cases. The number of test cases T is in the first line of the input file.
// 	For each test case, there are 10 lines, describing the web page and the relevance. Each line contains
// 	a character string without any blank characters denoting the URL of this web page and an integer
// 	Vi denoting the relevance of this web page. The length of the URL is between 1 and 100 inclusively.
// 	(1 ≤ Vi ≤ 100)

// Output
	// For each test case, output several lines which are the URLs of the web pages which are possible to be
	// chosen. The order of the URLs is the same as the input. Please look at the sample output for further
	// information of output format.

// Sample Input
// 2
// www.youtube.com 1
// www.google.com 2
// www.google.com.hk 3
// www.alibaba.com 10
// www.taobao.com 5
// www.bad.com 10
// www.good.com 7
// www.fudan.edu.cn 8
// www.university.edu.cn 9
// acm.university.edu.cn 10
// www.youtube.com 1
// www.google.com 2
// www.google.com.hk 3
// www.alibaba.com 11
// www.taobao.com 5
// www.bad.com 10
// www.good.com 7
// www.fudan.edu.cn 8
// acm.university.edu.cn 9
// acm.university.edu.cn 10
// Sample Output
// Case #1:
// www.alibaba.com
// www.bad.com
// acm.university.edu.cn
// Case #2:
// www.alibaba.com

/**
 * Created by kdn251 on 1/30/17.
 */

import java.util.*;

public class GoogleIsFeelingLucky {

    public static void main(String args[]) {

        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int caseCount = 1;

        for(int i = 0; i < testCases * 10; i++) {

            String website = sc.next();
            int relevance = sc.nextInt();

            if(i % 10 == 0 && i != 0) {

                List<String> allCandidates = map.get(max);
                System.out.println("Case #" + caseCount + ":");
                caseCount++;

                for(String s : allCandidates) {

                    System.out.println(s);

                }

                map = new HashMap<Integer, List<String>>();
                max = Integer.MIN_VALUE;

            }

            if(map.containsKey(relevance)) {

                map.get(relevance).add(website);

            }

            if(!map.containsKey(relevance)) {

                List<String> list = new ArrayList<String>();
                map.put(relevance, list);
                map.get(relevance).add(website);

            }

            if(relevance > max) {

                max = relevance;

            }

        }

        System.out.println("Case #" + caseCount + ":");

        for(String s : map.get(max)) {

            System.out.println(s);

        }

    }

}
