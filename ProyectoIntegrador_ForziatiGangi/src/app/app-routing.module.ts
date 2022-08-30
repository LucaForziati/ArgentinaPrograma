import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditAcercaComponent } from './components/acerca-de/edit-acerca.component';
import { EditpersonaComponent } from './components/banner/editpersona.component';
import { EditeducacionComponent } from './components/estudios/editeducacion.component';
import { NeweducacionComponent } from './components/estudios/neweducacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditproyectoComponent } from './components/proyecto/editproyecto.component';
import { NewproyectoComponent } from './components/proyecto/newproyecto.component';
import { EdithabilidadComponent } from './components/skills/edithabilidad.component';
import { NewhabilidadComponent } from './components/skills/newhabilidad.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'nuevaexp', component: NewExperienciaComponent},
  {path: 'editexp/:id', component: EditExperienciaComponent},
  {path: 'nuevaedu', component: NeweducacionComponent},
  {path: 'editedu/:id', component: EditeducacionComponent},
  {path: 'nuevahab', component: NewhabilidadComponent},
  {path: 'edithab/:id', component: EdithabilidadComponent},
  {path: 'editper/:id', component: EditpersonaComponent},
  {path: 'nuevopro', component: NewproyectoComponent},
  {path: 'editpro/:id', component: EditproyectoComponent},
  {path: 'editace/:id', component: EditAcercaComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
