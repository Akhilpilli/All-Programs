var Text = "How many natural numbers you want to print? "
 var readln = (typeof readline === 'function') ? (readline) : (function() {
     importPackage(java.io);
     importPackage(java.lang);
     importPackage(java.util);

     var stdin = new BufferedReader(new InputStreamReader(System['in']));
    
     
     return function() {
         System.out.print(Text);
         return String(stdin.readLine());  // Read line, 
     };                                    // force to JavaScript String
 }());
//print("How many natural numbers you want to print?");
var Count = parseInt(readln());
var input = 1;
var Counter = "";
while (input <= Count){
      Counter += " " + input;
      input++;}
    print("The first "+Count+" natural numbers are"+Counter+".");
