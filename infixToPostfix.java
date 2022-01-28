
static int Prec(char ch)
{
  switch(ch)
  {
    case '+':
    case '-':
      return 1;
    case '*':
    case '/':
      return 2;
    case '^':
      return 3;
  }
  return -1;
}
static String infixToPostfix(CQStack s, String exp)
{
	String result = new String("");
  for(int i=0;i<exp.length();i++)
  {
    char c = exp.charAt(i);
    if(Charater.isLetterOrDigit(c))
      result+=c;
    else if(c=='(')
      s.push(c);
    else if(c==')')
    {
      while(!s.isEmpty() && s.peek() != '(')
      {
        result+=s.pop();
        
      }
      
      s.pop();
    }
    
    else
    {
      while(!s.isEmpty() && Prec(c)<=Prec(s.peek())){
        result+=s.pop();
      }
      s.push(c);
    }
