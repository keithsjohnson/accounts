package uk.co.keithsjohnson.accounts.view.teammate;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;

import uk.co.keithsjohnson.accounts.model.Teammate;

public class TeammateAndLink {

	private final Teammate teammate;
	private final Link link;

	public TeammateAndLink(Teammate teammate) {
		this.teammate = teammate;
		this.link = linkTo(methodOn(TeammateController.class).getTeammate(teammate.getId())).withRel(teammate.getFirstName() + " " + teammate.getLastName());
	}

	public Teammate getTeammate() {
		return teammate;
	}

	public Link getLink() {
		return link;
	}
}