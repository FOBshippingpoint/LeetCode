/*
 * Date:    2023/0312
 * Problem: 9. Palindrome Number
 * Link:    https://leetcode.com/problems/palindrome-number/
 */

namespace LeetCode
{
    internal class PalindromeNumber
    {
        public bool IsPalindrome(int x)
        {
            if (x < 0)
            {
                return false;
            }
            string s = x.ToString();
            for (int i = 0; i < s.Length; i++)
            {
                char reverse = s[s.Length - 1 - i];
                if (s[i] != reverse)
                {
                    return false;
                }
            }
            return true;
        }
    }
}

