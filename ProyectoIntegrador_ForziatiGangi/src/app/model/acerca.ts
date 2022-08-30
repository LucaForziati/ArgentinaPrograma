export class Acerca {

    id?: number;
    acerca: string;
    nacimiento: string;
    email: string;
    lenguaje: string;

    constructor(acerca: string, nacimiento: string, email: string, lenguaje: string){
        this.acerca = acerca;
        this.nacimiento = nacimiento;
        this.email = email;
        this.lenguaje = lenguaje;
    }

}
