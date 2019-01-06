package dummy.project.service.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Getter @Setter @NoArgsConstructor
public class Topic
{
	String name;
	int price;
	int pages;
}