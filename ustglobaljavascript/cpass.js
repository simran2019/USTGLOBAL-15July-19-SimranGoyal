function validate(){
    let employeeData = document.forms['employeeform'];
   let empPass = employeeData.pass.value;
   let empCPass = employeeData.cpass.value;
   if(empPass==='' && empCPass===''){
       return false;
   }
   else if( empPass===empCPass){
       alert('success');
       return true;
   }
   else{
       alert('password not matching')
       return false;
   }
}
