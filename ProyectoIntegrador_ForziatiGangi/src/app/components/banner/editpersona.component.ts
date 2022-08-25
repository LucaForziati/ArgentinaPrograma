
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-editpersona',
  templateUrl: './editpersona.component.html',
  styleUrls: ['./editpersona.component.css']
})
export class EditpersonaComponent implements OnInit {

  persona: persona = null;
  fileName = '';

  constructor(
    private personaS: PersonaService,
    private activatedRouter: ActivatedRoute,
    private router: Router,
  ) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.personaS.getPersona().subscribe(
      data =>{
        this.persona = data;
      }, err =>{
        alert("Error al modificar experiencia");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.personaS.update(id, this.persona).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar a la persona");
         this.router.navigate(['']);
      }
    )
  }


}
