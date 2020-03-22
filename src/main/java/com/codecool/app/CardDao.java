package com.codecool.app;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CardDao {

    List<Card> getCardFromFile() throws IOException, ParserConfigurationException, SAXException;
}