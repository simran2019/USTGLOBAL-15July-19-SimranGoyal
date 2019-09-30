// getElementById()
let pElement = document.getElementById('demo');
console.log(pElement);
pElement.textContent='this is new  ours';
// getElementsByClassName()
let divElements = document.getElementsByClassName('blue');
console.log(divElements);
// getElementsByTagName()
let pElements = document.getElementsByTagName('p');
console.log(pElements);
// getElementsByName()
let nameElement = document.getElementsByName('hele');
console.log(nameElement);
// querySelector()
let demoElement = document.querySelector('#demo');
console.log(demoElement);
// querySelectorAll()
let blueClassElement = document.querySelectorAll('.blue');
console.log(blueClassElement);
// createElement()
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me';
console.log(buttonElement);
document.body.appendChild(buttonElement);
  let spanEle = document.getElementById('spanid');
spanEle.style.color ='red';
let buttonElement1 = document.getElementById('buttonEle');
// buttonElement1.className = 'add';
buttonElement1.classList = 'add add1'
document.getElementById('tableid').innerHTML=
 `<table border="1">
        <tr>
            <td>name</td>
            <td>age</td>
        </tr>
        <tr>
            <td>simi</td>
            <td>22</td>
        </tr>
        <tr>
        <td>ashu</td>
            <td>21</td>
            </tr>
</table>`;
 let pElementData=document.getElementById('demo1');
//  pElementData.style.color = 'purple';
// pElementData.className = 'blue';
pElementData.classList='blue fonts';
