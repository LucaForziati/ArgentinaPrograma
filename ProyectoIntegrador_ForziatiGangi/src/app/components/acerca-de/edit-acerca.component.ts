import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Acerca } from 'src/app/model/acerca';
import { AcercaService } from 'src/app/service/acerca.service';

@Component({
  selector: 'app-edit-acerca',
  templateUrl: './edit-acerca.component.html',
  styleUrls: ['./edit-acerca.component.css']
})
export class EditAcercaComponent implements OnInit {

  acerca: Acerca = null;

  constructor(
    private acercaS: AcercaService,
    private activatedRouter: ActivatedRoute,
    private router: Router
    ) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.acercaS.detail(id).subscribe(
      data => {
        this.acerca = data;
      }, err =>{
        alert("Error al modificar");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.acercaS.update(id, this.acerca).subscribe(
      data => {
        this.router.navigate(['']);
      }, err => {
        alert("Error al modificar acerca");
        this.router.navigate(['']);
      } 
    )
  }

}
