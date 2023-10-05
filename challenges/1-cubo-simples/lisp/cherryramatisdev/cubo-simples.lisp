(defun cubify-num (string-num)
  (let* ((num (parse-integer string-num :junk-allowed t)))
    (expt num 3)))

(defun main (&rest args)
  (if (> (length args) 0)
    (loop for arg in args do (print (cubify-num arg)))
    (print (cubify-num (read-line)))))
