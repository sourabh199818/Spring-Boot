import { Component, OnInit } from '@angular/core';
import { UserRegistrationService } from '../user-registration.service';

@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit {

   students:any = [];
   id:any =[];
   selectedId:any;
  constructor(private service: UserRegistrationService) { }




public findUserById(){

/*this.service.getUserById(this.id).subscribe(
    (data : any) => {
     this.students = data;




}
)*/
console.log(this.selectedId);
if(this.selectedId =='')
{

 this.service.getUser().subscribe(
    (data : any) => {
     this.students = data;

    }
   )
} else{
let resp =this.service.getUserById(this.selectedId);
     resp.subscribe((data)=>{
     this.students=[];
     this.students.push(data);
     });

}
}
 ngOnInit() {
  this.service.getUser().subscribe(
    (data : any) => {
     this.students = data;
     console.log(data);
    }
   )

//       resp.subscribe((student)=>this.student=student['data']);
  }

}
