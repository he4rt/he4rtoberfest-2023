args = ARGV[0].split(",")

valor_emprestimo = args[0].to_f
taxa_juros = args[1].to_f / 100
tempo_anos = args[2].to_i

puts (valor_emprestimo * (1 + taxa_juros) ** tempo_anos).round 2