(defun Fahrenheit-Celcius ()
  	(format t "~%Ponga la temperatura en Farenheit que desea convertir a Celsius~%"  )
  	(let* 
  		(  	
			(temperaturaf (read))
         	(temperaturac (* (- temperaturaf 32) 5/9))
		)
    	(format t 
            "~%~s degrees Fahrenheit is ~s degrees Celsius~%"
			temperaturaf
            (float temperaturac)
		)  		;; print floated value
    	temperaturac	;; return ration value
	)
)
