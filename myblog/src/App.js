
import { useEffect, useState } from 'react';

function App() {
	const [players, setPlayers] = useState([]);
	useEffect(() => {
		fetch( 'http://localhost:4000/' )
			.then(res => res.json())
			.then(data => setPlayers(data));
	}, []);
	
	return (
		<div className="App">
			<header className="App-header">
				<h1>All players</h1>
				{players && players.map(player => (
					<div key={player.id}>{player.name}</div>
				))}
			</header>
		</div>
	);
}

export default App;

