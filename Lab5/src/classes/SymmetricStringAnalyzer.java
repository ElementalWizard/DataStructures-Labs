package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() {
		LLStack<Character> stack = new LLStack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    stack.push(c);
                }
                else{
                    if(stack.top()==Character.toUpperCase(c)){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

	}
	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		String painNSuffering="";
		if(!isValidContent()){
		    throw new StringIsNotSymmetricException("the string is not valid");
        }else{
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (Character.isUpperCase(c)){
                    painNSuffering+=" <" + c + " ";
                }else {
                    painNSuffering+= c +"> ";
                }
            }
        }
		
		return painNSuffering;  // need to change if necessary....
	}

}
