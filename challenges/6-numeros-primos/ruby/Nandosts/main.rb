numero = gets.chomp.to_i

def primo?(numero)
  return true if numero == 2 # 2 é o único primo par
  return false if numero <= 1 || numero.even? # 1 não é primo e nenhum par diferente de 2 é primo

  # Utilizando step 2 para verificar apenas os impares. Pares diferente de 2 nunca são primos.
  (3..numero - 1).step(2).each do |i|
    return false if (numero % i).zero?
  end
  true
end

puts(primo?(numero))