/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    unordered_map<int, int>mp;
    void rightSideViewH(TreeNode* root, int k = 0) {
        
        if(root->left){
            rightSideViewH(root->left, k+1);
            mp[k] = root->left->val;
        }if(root->right){
            rightSideViewH(root->right, k+1);
            mp[k] = root->right->val;
        }
    }
    vector<int> rightSideView(TreeNode* root){
        vector<int>v;
        
        if(root == NULL)
            return v;
        
        v.push_back(root->val);
        rightSideViewH(root);
        for(auto it = 0; it < mp.size(); it++){
            v.push_back(mp[it]);
        }
        return v;
    }
};