package com.codecool.app;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLCardDao implements CardDao {
    private List<Card> cards = new ArrayList<Card>();
    @Override
    public List<Card> getCardFromFile() throws IOException, ParserConfigurationException, SAXException {
        File XMLFile = new File("src/main/resources/games.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(XMLFile);
        doc.getDocumentElement().normalize();
        NodeList cardList = doc.getElementsByTagName("card");
        for(int i = 0; i < cardList.getLength(); i++){
            Node node = cardList.item(i);
            Element eElement = (Element) node;
            String name = eElement.getElementsByTagName("title").item(0).getTextContent();
            int metascore = Integer.parseInt(eElement.getElementsByTagName("metascore").item(0).getTextContent());
            int userScore = Integer.parseInt(eElement.getElementsByTagName("userScore").item(0).getTextContent());
            int numberOfCopies = Integer.parseInt(eElement.getElementsByTagName("number_of_copies").item(0).getTextContent());
            int openingMonthIncome = Integer.parseInt(eElement.getElementsByTagName("opening_income").item(0).getTextContent());
            Card card = new Card(name, metascore, userScore, numberOfCopies, openingMonthIncome);
            cards.add(card);
        }
        return cards;
    }
}
