def check_if_is_palindrome(phrase)
    original = phrase.upcase
    reverse = original.reverse 
    if original != reverse
        return false 
    end 
    return true
end 


ARGV.each do|value|
    puts check_if_is_palindrome(value.to_s)
end