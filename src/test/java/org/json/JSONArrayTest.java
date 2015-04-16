package org.json;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class JSONArrayTest {

   @Test
   public void shouldBeAbleToCallTheCollectionConstructor() {

      Collection<Integer> integerCollection = new ArrayList<Integer>();
      integerCollection.add(100);
      integerCollection.add(200);

      JSONArray jsonArray = new JSONArray(integerCollection);

      assertEquals(2, jsonArray.length());
      assertEquals(100, jsonArray.get(0));
      assertEquals(200, jsonArray.get(1));
   }
}
