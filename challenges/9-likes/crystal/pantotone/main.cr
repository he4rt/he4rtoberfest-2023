def parseArrayFromString(string)
    bracketless = string.sub('[', "").sub(']', "")

    list = bracketless.split(',').map do |item|
        trimmed = item.strip
        trimmed[1, trimmed.size - 2] if trimmed.size > 1
    end

    list.select! {|item| item.is_a?(String)}

    return list
end

def processLikes(entries)
    case entries.size
        when 0 
            return "Ninguém curtiu isso"
        when 1 
            return "%s curtiu isso" % entries
        when 2 
            return "%s e %s curtiram isso" % entries
        when 3 
            return "%s, %s e %s curtiram isso" % entries
        else 
            return "%s, %s e outras %s pessoas curtiram isso" % [entries[0], entries[1], entries.size - 2]
    end
end

entries = parseArrayFromString(ARGV[0])
puts processLikes(entries)