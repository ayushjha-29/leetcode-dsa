class Solution {

    public char [] stack;

    public int top = -1;

    void push(char c){
        stack[++top] = c;
    }

    void pop(){
        top--;
    }

    char peek(){
        return stack[top];
    }

    public boolean isValid(String s) {
        stack = new char[(s.length())];

        for(int i=0 ; i<s.length() ; i++){
            char bracket = s.charAt(i);

            if(bracket == '(' || bracket == '[' || bracket == '{'){
                push(bracket);
            }else{
                if(top == -1){
                    return false;
                }

                char expected;

                if(bracket == ')'){
                    expected = '(';
                }else if(bracket == ']'){
                    expected = '[';
                }else{
                    expected = '{';
                }

                if(expected != peek()){
                    return false;
                }

                pop();
            }
        }

        return top == -1;

    }
}