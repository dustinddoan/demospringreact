import React, { Component } from "react";
import axios from "axios";

export class User extends Component {
	componentDidMount() {
		axios.get("/user").then(response => {
			console.log(response);
		});
	}
	render() {
		return <div />;
	}
}

export default User;
