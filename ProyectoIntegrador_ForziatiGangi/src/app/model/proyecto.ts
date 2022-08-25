export class Proyecto {
    id?: number;
    nombreP: string;
    descripcionP: string;
    imagen: string;
    linkP: string;

    constructor(nombreP: string, descripcionP: string, imagen: string, linkP: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imagen = imagen;
        this.linkP = linkP;
    }
}
