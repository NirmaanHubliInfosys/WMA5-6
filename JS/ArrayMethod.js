Array is datastructure that contains list of element of same data typeof.

Array methods:
filter methods
pop method
map method
find method
concat method
slice method
push method
sort method


Filter syntax:
variablename.filter(methodname);

var age=[2,6,7,8,9]
function myFilter(age){
    return age>=4;
}
var selected=age.filter(myFilter);
console.log("ages of the selected candidates are"+selected);

output:
ages of the selected candidates are 6,7,8,9


Map syntax:
variablename.map(methodname);

var age=[3,6,7,8,9]
function myMap(age){
    return age-4;
}
var selected=age.map(myMap);
console.log("ages of the selected candidates are"+selected);

output:
ages of the selected candidates are -1,2,3,4,5


Concatination syntax:
array1.concat(array2)

var frontend=["html","css"];

var backend=["java","python"];

var tech=frontend.concat(backend);

console.log(tech)

output:
['html', 'css', 'java', 'python']

Push method:
add thevalues in the end of the array

syntax:
array.push(item1,item2,item)

Ex:
var frontend=["html","css"];
var pushMethod=frontend.push('bootstrap');
pushMethod
3
console.log(pushMethod);
output:
frontend
(3) ['html', 'css', 'bootstrap']

unshift:
add the values in  the begining of the array

syntax:
array.unshift(item1,item2,item);

var frontend=['html', 'css', 'bootstrap']
var pushMethod=frontend.unshift('js');

output:
['js','html', 'css', 'bootstrap']

pop method:
always removes values end of the array
syntax:
frontend.pop();

output:
(3) ['js', 'html', 'css']


find method:
syntax:
Array.find();

var data=[1,10,50,100,40,6,12,20,10];

function checkEligibility(data){
    return data>18;
}
console.log(data.find(checkEligibility));

sort method:
syntax:
array.sort(compareFunction)
var data1=[1,100,40,6,12];
var data=[2,3,4,1,4,5];
var result=data.sort();

console.log(result)

var data=[1,100,40,6,12,20,10,10,40];
data.sort();

var data=[1,100,40,6,12,20,10,10,40];
data.sort();

data.sort(function(a,b){return a-b});
(9) [1, 6, 10, 10, 12, 20, 40, 40, 100]
data.sort(function(b,a){return b-a});
(9) [1, 6, 10, 10, 12, 20, 40, 40, 100]
data.sort(function(c,b){return c-b});
(9) [1, 6, 10, 10, 12, 20, 40, 40, 100]
