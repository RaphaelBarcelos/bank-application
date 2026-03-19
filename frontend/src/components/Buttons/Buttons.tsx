import { useNavigate } from 'react-router-dom'
import './Buttons.css'

export function LogInButton() {
    const navigate = useNavigate()

    return (
        <button className="login-button" onClick = {() => navigate('/login')}>
            Login Empresas
        </button>
    )
}

export function SignUpButton() {
    const navigate = useNavigate()
    
    return (
        <button className="signup-button" onClick = {() => navigate('/signup')}>
            Quero ser Cliente
        </button>
    )
}


