import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { EstudiosComponent } from './components/estudios/estudios.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { ContactComponent } from './components/contact/contact.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { interceptorProvider } from './service/interceptor-service';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NeweducacionComponent } from './components/estudios/neweducacion.component';
import { EditeducacionComponent } from './components/estudios/editeducacion.component';
import { NewhabilidadComponent } from './components/skills/newhabilidad.component';
import { EdithabilidadComponent } from './components/skills/edithabilidad.component';
import { EditpersonaComponent } from './components/banner/editpersona.component';
import { NewproyectoComponent } from './components/proyecto/newproyecto.component';
import { EditproyectoComponent } from './components/proyecto/editproyecto.component';
import { EditAcercaComponent } from './components/acerca-de/edit-acerca.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BannerComponent,
    AcercaDeComponent,
    EstudiosComponent,
    ExperienciaComponent,
    SkillsComponent,
    ProyectoComponent,
    ContactComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    NeweducacionComponent,
    EditeducacionComponent,
    NewhabilidadComponent,
    EdithabilidadComponent,
    EditpersonaComponent,
    NewproyectoComponent,
    EditproyectoComponent,
    EditAcercaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
