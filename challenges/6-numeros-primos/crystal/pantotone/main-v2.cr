number : Int32 = ARGV[0].to_i

def isPrime(number : Int32) 
    return false if number < 2
    return true if number == 2

    divisor : Int32 = 1
    unless divisor > Math.isqrt(number) 
        divisor += 1
        return false if number % divisor == 0
    end

    return true
end

puts isPrime(number)