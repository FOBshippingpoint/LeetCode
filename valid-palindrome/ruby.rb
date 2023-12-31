# @param {String} s
# @return {Boolean}
def is_palindrome(s)
    s = s.gsub(/[^[[:alnum:]]]/, '').downcase
    s == s.reverse
end
