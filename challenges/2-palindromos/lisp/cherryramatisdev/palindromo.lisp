(defun palindromo? (word)
  "Check if a given `word' is a palindrome"
  (let* ((downcased-word (string-downcase word))
         (reversed-word (reverse downcased-word)))
    (string-equal downcased-word reversed-word)))

(defun print-palindromo (word)
  "A function that use `'palindromo? but print the correct word to STDOUT"
  (if (palindromo? word)
    "true"
    "false"))

(defun main (&rest args)
  (if (> (length args) 0)
    (loop for arg in args do (print (print-palindromo arg)))
    (princ (print-palindromo (read-line)))))
