import {useEffect, useState} from 'react';

function App() {
	const API_PORT = "8000";
	const [message, setMessage] = useState([]);
	try() {
		useEffect(() => {
			fetch(`http://localhost:${API_PORT}/`)
				.then(res => res.text())
				.then(data => setMessage(data))
		}, []);
	} catch(e) {
		return (
			<div className="App">
				<header className="App-header">
					<h1>Error</h1>
					{e}
				</header>
			</div>
		);
	}
	
	return (
		<div className="App">
			<header className="App-header">
				<h1>message</h1>
				{message}
			</header>
		</div>
	);
}

export default App;
