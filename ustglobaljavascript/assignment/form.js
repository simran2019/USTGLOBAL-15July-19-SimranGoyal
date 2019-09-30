document.getElementById('formid').innerHTML=
`<form action="#" method="get">
    <div>
    <label for="name">Name</label>
    <input type="text" id="name" name="name">
    </div>
    <br/>
    <div>
    <label for="age">Age<label>
    <input type="number" id="age" name="age">
    </div><br/>
    <div>
    <label for="address">Address</label>
    <input type="text" id="address" name="address">
    </div><br/>
<div>
<label for="dob">DOB</label>
<input type="date" id="dob" name="dob">
</div><br/>
<div>
<label for="gender">Gender</label>
<input type="radio" id="gendeer" name="gender">Male
<input type="radio" id="gendeer" name="gender">Female
</div><br/>
<div>
<label for="email">E-mail</label>
<input type="email" id="email" name="email">
</div>
</form>`;