package hello;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.sprockets.google.Place;
import net.sf.sprockets.google.Places;
import net.sf.sprockets.google.Places.Field;

import org.apache.commons.lang.StringUtils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationSearchController {

	@RequestMapping("/locationSearch")
	public List<LocationResult> locationSearch(
			@RequestParam(value = "queryText", defaultValue = "Enterprise in New york") String queryText) {
		List<Place> places = new ArrayList<Place>();
		List<LocationResult> locationResults = new ArrayList<LocationResult>();
		try {

			/*// Find solr hits
			SolrQuery parameters = new SolrQuery();
			parameters.set("q", queryText + "*");
			QueryResponse response = null;
			String urlString = "http://localhost:8983/solr/collection1";
			SolrDocumentList list = null;
			SolrServer solr = new HttpSolrServer(urlString);
			try {
				response = solr.query(parameters);
				list = response.getResults();
			} catch (SolrServerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				SolrDocument solrDocument = (SolrDocument) iterator.next();
				LocationResult result = new LocationResult();
				String formattedAddress = (String) solrDocument
						.getFieldValue("ADDR_LINE_ONE");
				String latitude = (String) solrDocument.getFieldValue("LAT");
				String longitude = (String) solrDocument.getFieldValue("LON");
				if (StringUtils.isNotBlank(formattedAddress)) {
					result.setFormattedAddress(formattedAddress);

				}
				if (StringUtils.isNotBlank(latitude)) {
					result.setLatitude(latitude);

				}
				if (StringUtils.isNotBlank(longitude)) {
					result.setLongitude(longitude);

				}

				locationResults.add(result);
			}
*/
			// if (locationResults.isEmpty()) {

			// Google call
			long startTime = System.currentTimeMillis();
			places = Places.textSearch(
					new Places.Params()
							.query("Enterprise rent a car near " + queryText)
							.types("car_rental").maxResults(20), Field.NAME,
					Field.FORMATTED_ADDRESS, Field.GEOMETRY).getResult();
			long endTime = System.currentTimeMillis();
			if (places != null) {
				for (Place place : places) {
					System.out.println(place.toString());
					LocationResult result = new LocationResult();
					result.setFormattedAddress(place.getFormattedAddress());
					result.setName(place.getName());
					// if(place.getName().toLowerCase().contains("enterprise")){
					result.setLatitude(Double.toString(place.getLatitude()));
					result.setLongitude(Double.toString(place.getLongitude()));
					locationResults.add(result);
					// }

				}

				System.out.println("Time taken by google api call "
						+ (endTime - startTime));
				// }
			} else {
				System.out.println("Places didnt return anything!!");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return locationResults;
	}
}
