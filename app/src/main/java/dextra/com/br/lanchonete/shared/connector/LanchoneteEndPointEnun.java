package dextra.com.br.lanchonete.shared.connector;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by cledson.alves on 03/07/2018.
 */

@Retention(RetentionPolicy.SOURCE)
public @interface LanchoneteEndPointEnun {


    String ENDPOINT = "/localhost:8080/lanchonete";

}
