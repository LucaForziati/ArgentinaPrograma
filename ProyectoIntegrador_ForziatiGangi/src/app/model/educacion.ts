export class Educacion {

    id?: number;
    nombreEdu: string;
    institucion: string;
    descripcionEdu: string;
    agnoInicio: string;
    agnoFinal: string;

    constructor(nombreEdu: string, institucion: string, descripcionEdu: string, agnoInicio: string, agnoFinal: string){

        this.nombreEdu = nombreEdu;
        this.institucion = institucion;
        this.descripcionEdu = descripcionEdu;
        this.agnoInicio = agnoInicio;
        this.agnoFinal = agnoFinal
    }


}
