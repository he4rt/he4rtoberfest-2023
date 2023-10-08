number = ARGV[0].to_i

def smallestNumber(original : Int32) 
    return -1 if original < 10

    numbers = original.to_s.chars
    return -1 if numbers.uniq.size < 2

    finalNumber : Int32 = -1

    numbers.each_permutation do |generatedNumber|
        next if generatedNumber.size != numbers.size
        convertedNumber : Int32 = generatedNumber.join().to_i

        next if convertedNumber >= original

        if convertedNumber > finalNumber
            finalNumber = convertedNumber
        end
    end

    return finalNumber
end

puts smallestNumber(number)
