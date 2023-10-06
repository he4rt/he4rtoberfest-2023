number : Int32 = ARGV[0].to_i

def isPrime(number : Int32) 
    return false if number < 2

    divisors = (2..number).select do |divisor| 
        number % divisor == 0
    end

    return divisors.size == 1
end

puts isPrime(number)