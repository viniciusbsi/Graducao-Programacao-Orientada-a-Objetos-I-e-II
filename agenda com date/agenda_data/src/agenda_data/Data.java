package agenda_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Heloisa, Kauan & Vinicius on 9/4/17.
 */

public class Data {
    Date dataInicio;

    public Data() {

    }

    public Data(String dataInicio) throws ParseException {
        setDataInicio(dataInicio);
    }


    public String getDataInicio() {
        return converteDate(dataInicio);
    }

    public void setDataInicio(String dataInicio) throws ParseException {
        this.dataInicio = makeDate(dataInicio);
    }



    public String converteDate(Date data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        return sdf.format(data.getTime());
    }

    public Date makeDate(String dataInicio) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateInString = dataInicio;
        Date date = sdf.parse(dateInString);
        return date;
    }
    public boolean validaData(String data){
        try{
            makeDate(data);
        } catch (ParseException e) {
            return false;
        }
        return true;

    }
}
