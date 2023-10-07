entries = ARGV

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

puts processLikes(entries)