/*
 * Date:    2023/03/14
 * Problem: 14. Longest Common Prefix
 * Link:    https://leetcode.com/problems/longest-common-prefix/
 */

namespace LeetCode
{
    class Solution
    {
        public string LongestCommonPrefix(string[] strs)
        {
            // find the shortest str in strs
            var shortest = "";
            var shortestLen = 200;
            foreach (string str in strs)
            {
                if (str.Length < shortestLen)
                {
                    shortestLen = str.Length;
                    shortest = str;
                }
            }

            int commonLen = FindCommonLength(shortest, strs);
            return shortest.Substring(0, commonLen);
        }

        private int FindCommonLength(string str, string[] strs)
        {
            for (int i = 0; i < str.Length; i++)
            {
                char c = str[i];
                foreach (string s in strs)
                {
                    if (s[i] != c)
                    {
                        return i;
                    }
                }
            }
            return str.Length;
        }
    }
}

