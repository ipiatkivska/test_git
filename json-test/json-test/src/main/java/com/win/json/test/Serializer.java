package com.win.json.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author ipiatkivska
 */
public class Serializer {

    public static void main(String[] args) throws IOException {

        Map<String, String> hm = new HashMap<String, String>();

        hm.put("key", "value");
        hm.put("key1", "value1");
        hm.put("key2", "value2");
        User user = new User();
        ObjectMapper mapper = new ObjectMapper();
        
        List<String> list = new ArrayList<String>(hm.values());
        String join = "";
        if (list.size() > 0) {

            join = StringUtils.join(list, ", ");
        }

        user.setSegments(join);
        
        String writeValueAsString = mapper.writeValueAsString(user);
        
        System.out.println(writeValueAsString);
    }
}
