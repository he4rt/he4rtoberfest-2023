(defun decimal-to-binary (decimal)
  (if (zerop decimal)
      '()
      (append (decimal-to-binary (truncate (/ decimal 2)))
              (list (mod decimal 2)))))

(defun main (&rest args)
  (if (> (length args) 0)
    (loop for arg in args do (princ (format nil "~{~A~^~}" (decimal-to-binary (parse-integer arg :junk-allowed t)))))
    (princ (format nil "~{~A~^~}" (decimal-to-binary (parse-integer (read-line) :junk-allowed t))))))
