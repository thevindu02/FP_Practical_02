object question3 {

    def main(args: Array[String])=
        {
            def income(w:Double,o:Double):Double = {
                w*250 + 85*o
            }

            def tax(i:Double):Double = {
                i*0.12
            }

            def takehome(w:Double,o:Double):Double = {
                income(w,o) - tax(income(w,o))
            }

            println("The takehome salary = " + takehome(40,30)) 
            
        }




}