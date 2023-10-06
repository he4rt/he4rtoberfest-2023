valor_emprestimo = ARGV[0].to_f
taxa_juros = ARGV[1].to_f / 100
tempo_anos = ARGV[2].to_i

puts (valor_emprestimo * (1 + taxa_juros) ** tempo_anos).round 2