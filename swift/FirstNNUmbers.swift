import Foundation

var Count:Int
var Counter:Int = 1
print("Enter the number upto which you want to print the natural nubers :", terminator: "")
Count = Int(readLine()!)!
print("The first \(Count) natural numbers are", terminator: "")
for Counter in Counter...Count{
  print(" \(Counter)", terminator: "")
}
print(".")