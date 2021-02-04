public class Polynomial {

	
	private int[] array1;
    int l,i;
   public Polynomial()
    {
       array1= new int[5];
    }
	public void setCoefficient(int degree, int coeff){

		if(degree>=array1.length)
        {
            int[] array2= new int[degree+1];
            for(int i=0;i<array1.length;i++)
            {
                array2[i]=array1[i];
            }
            array1=array2;
        }
        array1[degree] = coeff;
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        for(i=0;i<array1.length;i++)
        {
            if(array1[i]!=0)
            {
                System.out.print(array1[i]+ "x" + i + " ");
            }
        }
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
int len2=p.array1.length;
        Polynomial res= new Polynomial();
        int len1=this.array1.length;
        if(len2<len1)
        {
        l=len2;
        }
        else
            l=len1;
        for(i=0;i<l;i++)
        {
            res.setCoefficient(i,p.array1[i]+this.array1[i]);
            
        }
        for(i=l;i<len1;i++)
        {
             res.setCoefficient(i,this.array1[i]);
        }
          for(i=l;i<len2;i++)
        {
             res.setCoefficient(i,p.array1[i]);
        }
		return res;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        int len2=p.array1.length;
        Polynomial res= new Polynomial();
        int len1=this.array1.length;
        if(len2<len1)
        {
        l=len2;
        }
        else
            l=len1;
         for(i=0;i<l;i++)
        {
            res.setCoefficient(i,this.array1[i]-p.array1[i]);
            
        }
        for(i=l;i<len1;i++)
        {
             res.setCoefficient(i,this.array1[i]);
        }
          for(i=l;i<len2;i++)
        {
             res.setCoefficient(i,-p.array1[i]);
        }
		return res;
        
			
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        int h=0,y=0;
         Polynomial res= new Polynomial();
        for(i=0;i<this.array1.length;i++)
        {
            for(int j=0;j<p.array1.length;j++)
            {
                if((i+j)< res.array1.length)
                    y= res.array1[i+j];
                else 
                 y=0;
                h=this.array1[i]*p.array1[j];
                res.setCoefficient(i+j,y+h);
            }
        }
        return res;
		
	}

}
