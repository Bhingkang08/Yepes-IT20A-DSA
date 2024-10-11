class Employee{
    #name;
    #baseSalary;


setName(val){
this.#name=val;
}
setBaseSalary(val){
this.#baseSalary=val;
}

getName(){
return this.#name;
}

getSalary(){
let Bonus=1000;
return this.#baseSalary + Bonus;
}
}

var emp=new Employee();

emp.setName("marchilyn");
emp.setBaseSalary(100);
console.log(emp.getName());
console.log(emp.getSalary());