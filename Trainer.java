class Trainer
{
String name;
long contactNo;
int exp;
Gender gender;

int age;

Trainer(String name,long contactNo,int age,Gender gender)
{
	
	this.name=name;
	this.contactNo=contactNo;
	this.age=age;
	this.gender=gender;
}
void setExp(int exp)
{
	this.exp=exp;
	
}
void printData()
{
	
	System.out.println(this.name);
	System.out.println(this.contactNo);
	System.out.println(this.age);
	System.out.println(this.gender.value);
	System.out.println(this.exp);
}

}