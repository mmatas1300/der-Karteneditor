package org.mmatas1300;

import com.mongodb.MongoException;
import com.mongodb.client.*;
import org.bson.Document;


public class RWCard {
     
    public void setCard(Card myCard){
        String connectionString = "mongodb+srv://mmatas1300:PASSWORD@karten.mobwh0x.mongodb.net/?authMechanism=SCRAM-SHA-1&retryWrites=true&w=majority";
        int lastCardId=0;
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("dieWortschatzkartei");
            MongoCollection<Document> collection = database.getCollection("Karten");
            //Leer lastid
            Document doc = collection.find().sort(new Document("_id", -1)).limit(1).projection(new Document("id", 1)).first();
            lastCardId = doc.getInteger("id");
            if (myCard instanceof Nomen1Card nomen1Card) {
                Document card = new Document("bild", myCard.getBild())
                        .append("beispiel", myCard.getBeispiel())
                        .append("sg", nomen1Card.getSg())
                        .append("anfangsbuchstabe",String.valueOf(nomen1Card.getAnfangsbuchstabe()))
                        .append("verwandte",nomen1Card.getVerwandte())
                        .append("typ",nomen1Card.getTyp())
                        .append("type",nomen1Card.getType())
                        .append("pl",nomen1Card.getPl())
                        .append("wort",nomen1Card.getWort())
                        .append("id",++lastCardId);
                collection.insertOne(card);
            } else if(myCard instanceof Nomen2Card nomen2Card){
                Document card = new Document("frau",nomen2Card.getFrau())
                        .append("bild",nomen2Card.getBild())
                        .append("beispiel",nomen2Card.getBeispiel())
                        .append("anfangsbuchstabe",String.valueOf(nomen2Card.getAnfangsbuchstabe()))
                        .append("mann",nomen2Card.getMann())
                        .append("verwandte",nomen2Card.getVerwandte())
                        .append("typ",nomen2Card.getTyp())
                        .append("manner",nomen2Card.getManner())
                        .append("frauen",nomen2Card.getFrauen())
                        .append("id",++lastCardId)
                        .append("type",nomen2Card.getType())
                        .append("wort",nomen2Card.getWort());
                collection.insertOne(card);
            } else if(myCard instanceof VerbeCard verbeCard){
                Document card = new Document("personalpronomen3",verbeCard.getPersonalpronomen3())
                        .append("personalpronomen2",verbeCard.getPersonalpronomen2())
                        .append("personalpronomen1",verbeCard.getPersonalpronomen1())
                        .append("infinitiv",verbeCard.getInfinitiv())
                        .append("personalpronomen6",verbeCard.getPersonalpronomen6())
                        .append("personalpronomen5",verbeCard.getPersonalpronomen5())
                        .append("personalpronomen4",verbeCard.getPersonalpronomen4())
                        .append("typ",verbeCard.getTyp())
                        .append("type",verbeCard.getType())
                        .append("wort",verbeCard.getWort())
                        .append("zeitformen",verbeCard.getZeitformen())
                        .append("bild",verbeCard.getBild())
                        .append("beispiel",verbeCard.getBeispiel())
                        .append("anfangsbuchstabe",String.valueOf(verbeCard.getAnfangsbuchstabe()))
                        .append("id",++lastCardId);
                collection.insertOne(card);
            } else if(myCard instanceof AndereWortCard andereWortCard){
                Document card = new Document("bild",andereWortCard.getBild())
                        .append("beispiel",andereWortCard.getBeispiel())
                        .append("anfangsbuchstabe",String.valueOf(andereWortCard.getAnfangsbuchstabe()))
                        .append("verwandte",andereWortCard.getVerwandte())
                        .append("typ",andereWortCard.getTyp())
                        .append("id",++lastCardId)
                        .append("type",andereWortCard.getType())
                        .append("andereWort",andereWortCard.getAndereWort())
                        .append("wort",andereWortCard.getWort());
                collection.insertOne(card);
            }
        } catch (MongoException e) {
            e.printStackTrace(System.out);
        }
    }  
}