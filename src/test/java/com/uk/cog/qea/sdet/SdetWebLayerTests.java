package com.uk.cog.qea.sdet;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;

import com.uk.cog.qea.sdet.controller.WebController;


@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)
public class SdetWebLayerTests {

	@Rule
	public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");
	
	@Before
	public void setUp() {
//	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
//	        .apply(documentationConfiguration(this.restDocumentation))
//	    .build();
	}
	
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
//        this.mockMvc.perform(get("/"))
//            .andExpect(status().isOk())
//            .andExpect(content().string(containsString("Hello World")));
    }
    
//    @Test
//    public void responseCodeTest() throws Exception {
//        this.mockMvc.perform(
//            get("/cms/status")
//                .accept(MediaType.APPLICATION_JSON)
//        )
//        .andExpect(status().isOk())
//        .andDo(
//            document("status")
//        
//    }
//    @Test
//    public void retrieveDocumentTest() throws Exception {
//        this.mockMvc.perform(get("/cms/document/{id}", 1L))
//            .andExpect(status().isOk())
//            .andDo(document("retrieveDocument",
//                pathParameters(
//                    parameterWithName("id").description("Document's id")
//                )
//        ));
//    }
    
//    @Test
//    public void retrieveDocumentTest() throws Exception {
//        this.mockMvc.perform(get("/cms/document/{id}", 1L))
//            .andExpect(status().isOk())
//            .andDo(document("retrieveDocument",
//                responseFields(
//                    fieldWithPath("author").description("Document's author"),
//                    fieldWithPath("title").description("Document's title")
//                )
//            ));
//    }
}