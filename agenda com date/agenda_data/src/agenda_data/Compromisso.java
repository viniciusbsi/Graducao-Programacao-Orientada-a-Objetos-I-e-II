package agenda_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Heloisa, Kauan & Vinicius on 9/4/17.
 */

public  class Compromisso extends Data {

    String descricao;
    String horaInicial;
    String horaFinal;
    ArrayList<Compromisso> compromissos = new ArrayList<>();

    public Compromisso() {
        super();
    }

    public Compromisso (String descricao, String dataInicio, String horaInicial,String horaFinal) throws ParseException {
        super(dataInicio);
        setDescricao(descricao);
        setHoraInicial(horaInicial);
        setHoraFinal(horaFinal);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void getCompromisso(){
        System.out.printf("Compromisso: %s -- Data: %s Horário Inicial: %s  Horário Final: %s\n", getDescricao(), getDataInicio(), getHoraInicial() , getHoraFinal());
    }
}
