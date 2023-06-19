
const express = require('express');
const cors = require('cors');

const app = express();

app.use(cors());

app.get('/', (req, res) => {
	res.json([
		{
			"id": "1",
			"name": "Theodore Emafae",
			"batting": 3.7,
			"pitching": 5.5,
			"baserunning": 3.2,
			"defense": 3.9
		}, 
		{
			"id": "2",
			"name": "Nick Roguelace",
			"batting": 4.0,
			"pitching": 3.4,
			"baserunning": 3.5,
			"defense": 4.3
		}, 
		{
			"id": "3",
			"name": "Benjamin Cede",
			"batting": 3.1,
			"pitching": 2.7,
			"baserunning": 3.9,
			"defense": 3.7
		}, 
		{
			"id": "4",
			"name": "Pitching Machine",
			"batting": 1.0,
			"pitching": 2.5,
			"baserunning": 1.0,
			"defense": 1.0
		}
	]);
});

app.listen(4000, () => {
	console.log("Listening for requests on port 4000...");
});

